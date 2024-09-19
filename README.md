<h1>Penalty Shootout Challenge</h1>

Create a Java game to simulate a penalty shoot out.

Rules : the keeper (computer) will randomly guess a position in the goal for a sequence of five penalties. Positions are 1 to 9 inclusive (save these in an array).

int[] saves = new int[5];

The user will be prompted in turn for a place to shoot the ball  (1..9 inclusive).  e.g.

![image](https://github.com/user-attachments/assets/7001cb93-6865-4510-ad7a-5e48897117b5)

If the user's shot matches the position the goalkeeper has pre-selected for that penalty then that's a save otherwise that's a goal.

<h2>Example output</h2>

![image](https://github.com/user-attachments/assets/0bddbb5b-091c-4982-9539-3b46dc33f8ef)

<h2>Some hints</h2>

You'll need the Random class to fill the array of five elements with nos. 1 to 9 inclusive for the saves.

Use a for loop to iterate through (5 times) each penalty ... check if the user's shot number is the same as the value in that position in the array. eg userShot == saves[0] etc..

To add some suspense to the game delay the Placing the ball ... Walking back ... Run up... SHOOT !  to do that, call this method between each part (1000 millisecs = 1 sec).

![image](https://github.com/user-attachments/assets/ab0f3372-fa1e-4647-bd90-669a0fe65bb4)



