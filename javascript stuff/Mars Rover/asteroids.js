//globals

var oxygen = 0;
var oceans = 0;
var temperature = -30;

var plants = 0;
var water = 0;
var heat = 0;

var stee = 0;
var tita = 0;

var playerAcceleration = [0, 0];
var playerSpeed = [0, 0];
var playerLocation = [0, 0];

var health = 1;
var armour = 0;
var titanium = 0;
var playerSpeedMax = 17;

var radius = 500;
var plantLocations = [];
var titaLocations = [];
var steeLocations = [];

var enemies = [];
var enemySpeed = 13;
var bullets = [];


var titacount = 0;
var fired = 0;
var write = '';

var mouselocat[];

function init(){
  canvas = document.getElementById("game");
  ctx = canvas.getContext("2d");

  ctx.font = "30px Arial";
  ctx.fillText("@", 0, 0);

  setInterval(update(), 16);
  scatterPlants(112);
  scatterTitanium(4);
  scatterSteel(10);
}

function update(){
  isDead();
  updatePlayer();

  spawnEnemies();
  updateEnemies();

  updateBullets();

  draw();
}

function draw(){
  ctx.restore();
  ctx.beginPath();
  ctx.arc(-playerLocation[0], -playerLocation[1], radius, 0, 2 * Math.PI);
  ctx.stroke();
  ctx.font = "30px Arial";
  ctx.fillText("@", 0, 0);
  for (var i = 0; i < plantLocations.length; i ++){
    ctx.fillText("p", plantLocation[i][0]-playerLocation[0], plantLocation[i][1]-playerLocation[1]);
  }
  for (i = 0; i < steeLocations.length; i ++){
    ctx.fillText("f", steeLocation[i][0]-playerLocation[0], steeLocation[i][1]-playerLocation[1]);
  }
  for (i = 0; i < titaLocations.length; i ++){
    ctx.fillText("t", titaLocation[i][0]-playerLocation[0], titaLocation[i][1]-playerLocation[1]);
  }
  for (i = 0; i < enemies.lengthl; i ++){
    ctx.fillText("><", enemies[i][0]-playerLocation[0], enemies[i][1]-playerLocation[1]);
  }
  for (i = 0; bullets.length; i ++){
    ctx.fillText("*", bullets[i][0]-playerLocation[0], bullets[i][1]-playerLocation[1]);
  }
}

function isDead(){
  if (health < 1){
    dead();
    return true;
  } else {
    return false;
  }
}

function dead(){
  clearInterval();
  if (oxygen == 14 && oceans == 9 && temperature == 8){
    winish();
  } else {
    lose();
  }
}

function updatePlayer(){
  for (i = 0; i < 2; i ++){
    if (titanium > 1 && titacount < 60){
      titacount += 1;
    } else if (titacount == 60){
      titacount = 0;
      titanium -= 1;
    }
    if (Math.abs(playerSpeed[i] + playerAcceleration[i]) < playerSpeedMax){
      playerSpeed[i] += playerAcceleration[i];
    }
      playerLocation[i] += playerSpeed[i];
  }
  if (playerLocation[0] * playerLocation[0] + playerLocation[1] * playerLocation[1] > radius){
    health = 0;
  } else {
    checkPickup(playerLocation);
  }
  if (fired > 0){
    fired -= 1;
  }
}

function damagePlayer(){
  if (armour > 0){
    armour -= 1;
  } else {
    health -= 1;
  }
}

function updateEnemies(){
  for (i = 0; i < enemies.length; i ++){
    dx = enemies[i][0] - playerLocation[0];
    dy = enemies[i][1] - playerLocation[1];
    theta = Math.atan(dx, dy);
    enemies[i][0] += enemySpeed * Math.cos(theta);
    enemies[i][1] += enemySpeed * Math.sin(theta);
    dx = enemies[i][0] - playerLocation[0];
    dy = enemies[i][1] - playerLocation[1];
    if (Math.abs(dx) < 0.1 && Math.abs(dy) < 0.1){
      damagePlayer();
      enemies.splice(i,0);
      i --; // accounting for shortening of array
    }
  }
}

function winish(){
  write += 'Your broken body remains a testament to the tenacity of mankind as the first settlers begin to build their homes here on Mars.';
  win();
}

function win(){
  write += 'You have succesfully made Mars habitable. We all owe you an unrepayable debt.';
  write();
}

function lose(){
  write += 'Your broken body remains a testament to the harshness of the Red Planet.';
  write();
}

function scatterPlants(x){
  for (i = 0; i < x; i ++){
    randR = radius * Math.random();
    randT = 2 * Math.PI * Math.random();
    randX = randR * Math.cos(randT);
    randY = randR * Math.sin(randT);
    plantLocations.push(randX, randY);
  }
}

function spawnEnemies(){
  while (enemies.length < 5){
    randR = radius * Math.random();
    randT = 2 * Math.PI * Math.random();
    randX = randR * Math.cos(randT);
    randY = randR * Math.sin(randT);
    if (!onScreen(randX, randY)){
      enemies.push(randX, randY);
    }
  }
}

function onScreen(x, y){
  if (Math.abs(playerLocation[0] - x) < 40 && Math.abs(playerLocation[1] - y) < 40){
    return true;
  } else {
  return false;
  }
}

function checkPickup(location){
  for (i = 0; i < plantLocations.length; i ++){
    if (Math.abs(plantLocations[i][0]-location[0]) < 0.1){
      if (Math.abs(plantLocations[i][1]-location[1]) < 0.1){
        pickupPlant(y);
      }
    }
  }
  for (i = 0; i < steeLocations.length; i ++){
    if (Math.abs(steeLocations[i][0]-location[0]) < 0.1){
      if (Math.abs(steeLocations[i][1]-location[1]) < 0.1){
        pickupStee(y);
      }
    }
  }
  i = 0;
  for (i = 0; i < titaLocations.length; i ++){
    if (Math.abs(titaLocations[i][0]-location[0]) < 0.1){
      if (Math.abs(titaLocations[i][1]-location[1]) < 0.1){
        pickupTita(y);
      }
    }
  }
}


function pickupPlant(y){
  plantLocations.splice(y,0);
  plant += 1;
}

function pickupStee(y){
  steeLocations.splice(y,0);
  stee += 1;
}

function pickupTita(y){
  titaLocations.splice(y,0);
  tita += 1;
}

function scatterSteel(x){
  for (i = 0; i < x; i ++){
    randR = radius * Math.random();
    randT = 2 * Math.PI * Math.random();
    randX = randR * Math.cos(randT);
    randY = randR * Math.sin(randT);
    steeLocations.push(randX, randY);
  }
}

function scatterTitanium(x){
  for (i = 0; i < x; i ++){
    randR = radius * Math.random();
    randT = 2 * Math.PI * Math.random();
    randX = randR * Math.cos(randT);
    randY = randR * Math.sin(randT);
    titaLocations.push(randX, randY);
  }
}

function oxygenate(){
  if (plants >= 8 && oxygen < 14){
    plants -= 8;
    oxygen += 1;
  }
}

function oceanate(){
  if (water >= 3 && oceans < 9){
    water -= 3;
    oceans += 1;
  }
}

function fire(){
  if (fired == 0){
    fired = 25;
    heat += 1;
    spawnBullet(playerLocation);
  }
}

function warm(){
  if (heat >= 8 && temperature < 8){
    heat -= 8;
    temperature += 2;
  }
}

function spawnBullet(location){
  if (bullets.length > 8){
    bullets.splice(0,0);
  }

  var px = (mouselocat[0] - location[0]);
  var py = (mouselocat[1] - location[1]);

  var vx = 1 * px / (px*px + py*py);
  var vy = 1 * py / (px*px + py*py);

  bullets.push(location[0], location[1], vx, vy);
}

function updateBullets(){
  for (i = 0; i < bullets.length; i ++){
    bullets[i][0] += bullets[i][2];
    bullets[i][1] += bullets[i][3];
    for (var j = 0; j < enemyLocations.length; j ++){
      if (Math.abs(bullet[i][0]-enemyLocations[j][0]) < 0.1){
        if (Math.abs(bullet[i][1]-enemyLocations[j][1]) < 0.1){
          enemyLocations.splice(j,0);
          bullets.splice(i,0);
          i --;
          j --;
          water += 1;
        }
      }
    }
  }
}

window.addEventListener("keydown",function(e){
  if(e.keyCode == 65 || e.keyCode == 37 && !isDead()){
    if (playerAcceleration[0] > -(2+titanium)){
      playerAcceleration[0] -= 0.2;
    } else {
      playerAcceleration[0] = -(2+titanium);
    }
  }

  if(e.keyCode == 87 || e.keyCode == 38 && !isDead()){
    if (playerAcceleration[1] < 2+titanium){
      playerAcceleration[1] += 0.2;
    } else {
      playerAcceleration[1] = 2+titanium;
    }
  }

  if(e.keyCode == 83 || e.keyCode == 4 && !isDead()){
    if (playerAcceleration[1] > -(2+titanium)){
      playerAcceleration[1] -= 0.2;
    } else {
      playerAcceleration[1] = -(2+titanium);
    }
  }

  if(e.keyCode == 68 || e.keyCode == 39 && !isDead()){
    if (playerAcceleration[0] < 2+titanium){
      playerAcceleration[0] += 0.2;
    } else {
      playerAcceleration[0] = 2+titanium;
    }
  }

  if(e.keyCode == 70 && stee > 0 && armour < 1){
    armour += 1;
    stee -= 1;
  }

  if(e.keyCode == 84 && tita > 0 && titanium < 2){
    titanium += 1;
    tita -= 1;
  }

  if(e.keyCode == 32){
      fire();
  }

});

// event handler function
function handler(e){
	    e = e || window.event;

	    var mouselocat[0] = e.mouselocat[0];
	    var mouselocat[1] = e.mouselocat[1];

	    // IE 8
	    if (mouselocat[0] === undefined) {
	        mouselocat[0] = e.clientX + document.body.scrollLeft + document.documentElement.scrollLeft;
	        mouselocat[1] = e.clientY + document.body.scrollTop + document.documentElement.scrollTop;
	    }

      mouselocat=[mouselocat[0], mouselocat[1]];
	}

	// attach handler to the click event of the document
	if (document.attachEvent) document.attachEvent('onclick', handler);
	else document.addEventListener('click', handler);
