# BuilderDesignPattern
Implementation of Builder Design Pattern Using PUBG Weapons Example.


<p align="center" width="100%">
   <img width="60%" height="300px" src="https://github.com/Satya190597/BuilderDesignPattern/assets/32733153/96218f51-1342-4a95-9e90-88ca0de19fdf"> 
</p>

# Problem Statement
In this example, we are attempting to solve a problem statement in which we need to generate a customized gun based on user input. 
This may lead to lots of different types of combinations, such as a short gun with a scope, a sniper with a suppressor, and guns with their own skins. 
To create an object, we require a constructor. However, creating different constructors with various parameters for all 
possible sets of combinations is not feasible. Therefore, in this example, we will attempt to address this issue using the builder design pattern.
# Important Classes.
- **GUN** - Gun Model Class.
- **GunBuilder** - Builder Class.
# Enums
- **GunScope** - Scope levels, like 2x, 3x, 4x etc.
- **GunSkin** - Skin types.
- **GunType** - Gun types like SMG, Assault Rifle etc. 
# Test Classes.
- **PUBGTest** - This class contains test cases to determine, based on user input, whether we can generate an appropriately customized gun or not.
# Prerequisite
- Java 8 or above.
# Dependencies
- junit
- junit-jupiter-api
