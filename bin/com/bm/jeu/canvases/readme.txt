What do these files do?

Canvases are used to render objects (also known as views or controls). Different canvases handle 
the rendering of different types of views. Usually, this is specified in the name. 

See below for a detailed example of each canvas:

BaseCanvas
----------

The BaseCanvas renders a debug grid.
It could also be used for any other 'low-level' tasks. 

GenericCanvas
-------------

As the name suggests, a GenericCanvas that is derived from the BaseCanvas. It currently
has no purpose.

InterfaceCanvas
---------------

The InterfaceCanvas class handles the rendering and maintenance of any UI objects that we want to use.
For example, InterfaceCanvas renders the input and output chatboxes, and spawns the threads that they
use to communicate with a server.

PlayerCanvas
------------

This class handles the rendering of sprites for players.

TerrainCanvas 
--------------

This class handles the rendering of terrain objects (eg: grass, water)
on the screen.
