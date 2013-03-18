README
------

Jeu is designed to be a lightweight 2D Java RPG.

The goals of the project are simply to produce clean, well-commented, functional code, rather than a fun RPG. 
Perhaps the project's code could be used as a base for a proper 'game'?

The main source code of the program can be found in src/com/bm/jeu.

Immediate TODOs:

 * Create some way of automatically incrementing build numbers
 * Clean up the bin/ folder in some way.
 * Write better documentation into classes!

Changelog:

V1.1.2
------

 * Merged the /connect and /login commands client-side. The player
   now carries out the function of both by simply typing /connect [HOST]
   However - the two protocol messages are still separate server-side.

V1.1.1
------

 * [IMPORTANT] Removed inconsistent underscores before some methods!
 * [IMPORTANT] Moved Sprite.java class to controls package, because it is technically a custom-coded view.
 * Added 'readme' files to each directory, explaining what the files inside the directory do. 
 * Generated a basic (incomplete) JavaDoc, found under com/bm/jeu/doc.
 * Created an ant build file (using eclipse - not tested)
