# build
The gradle file is build script for configuring the current project.

It must be edited for the project to include DESFireLib.

1  Create "lib" folder in project root folder.
2  In dependencies add implementation of fileTree that includes DESFireLib.jar

|IMPLEMENTATION                                |DESCRIPTION                                                                                        |
|:---------------------------------------------|:--------------------------------------------------------------------------------------------------|
|fileTree(dir: 'lib', include: 'DESFireLib.jar')|Implements DESFireLib library|
