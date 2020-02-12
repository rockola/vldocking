# vldocking

This is a fork of https://github.com/cmadsen/vldocking, which is a fork
of https://bitbucket.org/akuhtz/vldocking

## Why ?

Because the original project seems to be dead :(

See https://code.google.com/p/vldocking/ for more information, tutorials etc.

## And so, what's new ?

* Code is formatted according to the [Google Java Style Guide](https://google.github.io/styleguide/javaguide.html).
* Some fixes were made to make the library run on Java 8.
* Tutorial 1 is included as a sample application. To run: ```mvn compile``` 

(these changes are by upstream)

* Switched from ant to mvn
* Renamed package names to use old vlsolutions instead of vldocking
* Released a 3.0.3 version available through maven central
* Fixed issues with read/wrilXML on multiple screens
* Added new empty ctor to `FloatingDialog` to make floating windows
  appear in taskbar. Extend
  `DefaultDockableContainerFactory.createFloatingDockableContainer`
  and return `new FloatingDialog()`
* Fixed LAF issues e.g., when switching Substance skin
* Fixed issue with borders not being set on single dock windows until
  an ancestor change events occured

## How to get the released versions ?

### Maven

Upstream has released a version on Maven Central.

Just add this to your `pom.xml` file:

The dependencies:

```xml
<dependency>
    <groupId>dk.navicon</groupId>
    <artifactId>vldocking</artifactId>
    <version>3.0.4</version>
</dependency>
```

# VLDocking, the Swing docking framework

The VLDocking framework is a commercial-grade Swing Framework providing rich docking features which can easily be integrated with existing applications (and of course new ones).

VLDocking has been created in 2004, and is licenced as under the LGPL terms.

VLDocking is used by companies worldwide and open source projects.

![](http://vldocking.googlecode.com/svn/wiki/vldocking3.jpg)

License
=======

VLDocking is licensed as LGPL

Contributions
=============

VLDocking was initially designed by Lilian Chamontin at his former company VLSolutions. 

Contributors are welcome!

There is a mailing list at Google Groups:

https://groups.google.com/forum/#!forum/vldocking

## Documentation

The VLDocking tutorial can be found at https://code.google.com/p/vldocking/wiki/tutorial1

There is also a work-in-progress copy with some fixes/additions, but
unfortunately worse layout, on GitHub at
https://github.com/rockola/vldocking/wiki

## I found a bug, what can I do ?

Feel free to fork this repo, and make a pull request. Ideally, write a test!
 
