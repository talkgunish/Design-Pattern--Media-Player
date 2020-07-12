# Design-Pattern--Media-Player
Adapter Design Pattern- Media Player


Adapter Design Pattern
Adapter pattern works as a bridge between two incompatible interfaces. This type of design pattern comes under structural pattern as this pattern combines the capability of two independent interfaces.This pattern involves a single class which is responsible to join functionalities of independent or incompatible interfaces. A real life example could be a case of card reader which acts as an adapter between memory card and a laptop. You plugin the memory card into card reader and card reader into the laptop so that memory card can be read via laptop.
Application with Problem:
-
-
-
-
-
-
-
An image viewer can view only .jpg files All Image viewers are not same.
There are compatibility issues.
Objective
When an object needs to utilize an existing class with an incompatible interface.
When you want to create a reusable class that cooperates with classes which don't have compatible interfaces.
When you want to create a reusable class that cooperates with classes which don't have compatible interfaces.
We are demonstrating use of Adapter pattern via following example in which an image viewer device can view .jpg files only and wants to use an advanced viewer capable of viewing .png and .gif files.
 UML Diagram
Design
   IMPLEMENTATION
We have an image viewer interface and a concrete
class MediaPlayerr implementing
the MediaPlayer interface. MediaPlayerr can view jpg format image files by default.
We are having another interface AdvancedMediaViewer and concrete classes implementing the AdvancedMediaViewer interface. These classes can view .gif and .gif format files

We want to make MediaPlayerr to play other formats as well. To attain this, we have created an adapter class MediaAdapter which implements the MediaPlayer interface and uses AdvancedMediaViewer objects to view the required format
MediaPlayerr uses the adapter class MediaAdapter passing it the desired image type without knowing the actual class which can view the desired format. AdapterPatternDemo, our demo class will
use MediaPlayerr class to view various formats.
