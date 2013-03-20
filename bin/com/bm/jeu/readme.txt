What do these files do?

Classes inside of the jeu package are general classes that don't fit very well
elsewhere. They may be moved to their own specialised package later on in development.

Explanation of classes:

Launcher.java
-------------

The game is 'launched' through the launcher, it is the first class
that is called. It has the capacity to display a splash-screen, but this
is disabled. 

It could be used in future to run start-up checks of some kind.

Player.java
-----------

This class is a template for a local player - IE: a player that the
user controls. It contains methods relating to the player, and statistics
relating to it, also - eg: health.

It also contains methods, KeyMaps and ActionMaps that control the player's
movement.

PlayerHandler.java
------------------

This class literally 'handles' the creation of a player, and chains
some methods in the Player class together, to make creating a new player
simpler.

It also handles the creation and positioning of remote players on the 
user's map.

RemotePlayer.java
-----------------

Similar to the 'Player.java' class, except this class doesn't provide methods
or keymaps for movements. Currently, this is a separate class altogether, but in the future
it could implement or extend the Player class in some way, to make maintaining the two classes
easier.