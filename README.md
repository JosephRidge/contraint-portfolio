
# Objective :
* Implement simple Koltin application that highlights more on the use of Constraint Layout, collections and Simple Kotlin logic operations and screen size responsiveness
* 
## Preparation :
To be able to use it we need to addd the following:
*  implementation 'androidx.constraintlayout:constraintlayout:2.1.3'* // already added by default
*  maven.google.com in settings.gradel 
*   
## Update highlighted on creating applications that can work on multiple screen sized devices :
 To achieve this the following steps were taken :
 - navigate to the res directory , right click and select new > android resource file
 - Once done a pop up form will appear, set the following sections :
    - Resource Type : Layout
    - qualifier : Size
    - select screen target size once selected size ( small , normal, large,  xlarge)

    ![Screenshot at 2022-03-28 12-01-18](https://user-images.githubusercontent.com/42699812/160370253-d70c0b72-99b4-4daa-aae8-d2d2c9bbbbb6.png)

    ![Screenshot at 2022-03-28 12-01-54](https://user-images.githubusercontent.com/42699812/160370264-a2d4f514-11de-49c9-8028-d0782dcb83b5.png)
 - adding orientation responsiveness :
    - We will go through the same procedure as above, however, this time round we will add a new qualifier, *Orientation* and set it to landscape

    ![Screenshot at 2022-03-28 16-13-44](https://user-images.githubusercontent.com/42699812/160405309-80fa6568-8a7a-4d84-b49e-5dd51359313a.png)
 - adding orientation responsiveness to the default view/ layout :
    - Navigate to the target activity xml file and select create other option :

    ![create](https://user-images.githubusercontent.com/42699812/160553590-9874ee88-c9d5-448f-8e2b-c92db4590a6c.png)

    ![land](https://user-images.githubusercontent.com/42699812/160553751-59ec5c68-e193-444d-95af-b79a124ab2bc.png)

## Note :
* This is a follow through tutorial on Constraint layout, with my different implementation 
 
