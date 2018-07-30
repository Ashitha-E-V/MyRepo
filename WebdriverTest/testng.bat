set projectLocation=C:\Users\ashiev\Documents\myself\Firm\Phase2\testWorkspace
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml
pause

