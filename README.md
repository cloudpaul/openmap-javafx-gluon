# Gluon Openmap Example

This Gluon Client sample was generated from https://start.gluon.io

We have a simple JavaFX form containing an Openmap map.
The Openmap code was borrowed from SimpleMap.main

![](gluon-openmap.png)

## Quick instructions

Gluon:

    mvn clean client:build
    
or

    mvn clean package
    java -agentlib:native-image-agent=config-output-dir=META-INF -jar target/gluon-openamp-1.0.0-SNAPSHOT.jar
    native-image --no-fallback --verbose  -jar target/gluon-openamp-1.0.0-SNAPSHOT.jar
    
### Run the sample as a native image

    mvn client:build client:run


## Selected features

This is a list of all the features that were selected when creating the sample:

### JavaFX 15.0.1 Modules

 - javafx-base
 - javafx-graphics
 - javafx-controls
 - javafx-fxml

## Does not work!
native-image fails at runtime with

```
[paul@mxpc ~/dev/graalvm/gluon-openmap (master)]: ./map
Exception in Application start method
Exception in thread "main" java.lang.RuntimeException: Exception in Application start method
    at com.sun.javafx.application.LauncherImpl.launchApplication1(LauncherImpl.java:900)
    at com.sun.javafx.application.LauncherImpl.lambda$launchApplication$2(LauncherImpl.java:195)
    at java.lang.Thread.run(Thread.java:834)
    at com.oracle.svm.core.thread.JavaThreads.threadStartRoutine(JavaThreads.java:519)
    at com.oracle.svm.core.posix.thread.PosixJavaThreads.pthreadStartRoutine(PosixJavaThreads.java:192)
Caused by: java.lang.UnsatisfiedLinkError: no javafx_font in java.library.path
    at com.oracle.svm.core.jdk.NativeLibrarySupport.loadLibraryRelative(NativeLibrarySupport.java:132)
    at java.lang.ClassLoader.loadLibrary(ClassLoader.java:275)
    at java.lang.Runtime.loadLibrary0(Runtime.java:830)
    at java.lang.System.loadLibrary(System.java:1871)
    at com.sun.glass.utils.NativeLibLoader.loadLibraryInternal(NativeLibLoader.java:163)
    at com.sun.glass.utils.NativeLibLoader.loadLibrary(NativeLibLoader.java:53)
    at com.sun.javafx.font.PrismFontFactory.lambda$static$0(PrismFontFactory.java:98)
    at java.security.AccessController.doPrivileged(AccessController.java:84)
    at com.sun.javafx.font.PrismFontFactory.<clinit>(PrismFontFactory.java:96)
    at com.oracle.svm.core.classinitialization.ClassInitializationInfo.invokeClassInitializer(ClassInitializationInfo.java:375)
    at com.oracle.svm.core.classinitialization.ClassInitializationInfo.initialize(ClassInitializationInfo.java:295)
    at com.sun.javafx.text.PrismTextLayout.<clinit>(PrismTextLayout.java:66)
    at com.oracle.svm.core.classinitialization.ClassInitializationInfo.invokeClassInitializer(ClassInitializationInfo.java:375)
    at com.oracle.svm.core.classinitialization.ClassInitializationInfo.initialize(ClassInitializationInfo.java:295)
    at com.sun.javafx.text.PrismTextLayoutFactory.<clinit>(PrismTextLayoutFactory.java:33)
    at com.oracle.svm.core.classinitialization.ClassInitializationInfo.invokeClassInitializer(ClassInitializationInfo.java:375)
    at com.oracle.svm.core.classinitialization.ClassInitializationInfo.initialize(ClassInitializationInfo.java:295)
    at com.sun.javafx.tk.quantum.QuantumToolkit.getTextLayoutFactory(QuantumToolkit.java:1141)
    at com.sun.javafx.scene.control.skin.Utils.<clinit>(Utils.java:99)
    at com.oracle.svm.core.classinitialization.ClassInitializationInfo.invokeClassInitializer(ClassInitializationInfo.java:375)
    at com.oracle.svm.core.classinitialization.ClassInitializationInfo.initialize(ClassInitializationInfo.java:295)
    at com.sun.javafx.css.StyleManager.getURL(StyleManager.java:872)
    at com.sun.javafx.css.StyleManager.loadStylesheetUnPrivileged(StyleManager.java:1088)
    at com.sun.javafx.css.StyleManager.loadStylesheet(StyleManager.java:943)
    at com.sun.javafx.css.StyleManager._setDefaultUserAgentStylesheet(StyleManager.java:1391)
    at com.sun.javafx.css.StyleManager.setUserAgentStylesheets(StyleManager.java:1242)
    at com.sun.javafx.application.PlatformImpl.lambda$_setPlatformUserAgentStylesheet$20(PlatformImpl.java:849)
    at java.security.AccessController.doPrivileged(AccessController.java:84)
    at com.sun.javafx.application.PlatformImpl._setPlatformUserAgentStylesheet(PlatformImpl.java:848)
    at com.sun.javafx.application.PlatformImpl.setPlatformUserAgentStylesheet(PlatformImpl.java:693)
    at com.sun.javafx.application.PlatformImpl.setDefaultPlatformUserAgentStylesheet(PlatformImpl.java:657)
    at javafx.scene.control.Control.<clinit>(Control.java:99)
    at com.oracle.svm.core.classinitialization.ClassInitializationInfo.invokeClassInitializer(ClassInitializationInfo.java:375)
    at com.oracle.svm.core.classinitialization.ClassInitializationInfo.initialize(ClassInitializationInfo.java:295)
    at java.lang.Class.ensureInitialized(DynamicHub.java:530)
    at com.oracle.svm.core.classinitialization.ClassInitializationInfo.initialize(ClassInitializationInfo.java:260)
    at java.lang.Class.ensureInitialized(DynamicHub.java:530)
    at com.oracle.svm.core.classinitialization.ClassInitializationInfo.initialize(ClassInitializationInfo.java:260)
    at java.lang.Class.ensureInitialized(DynamicHub.java:530)
    at java.lang.Class.newInstance(DynamicHub.java:876)
    at javafx.fxml.FXMLLoader$InstanceDeclarationElement.constructValue(FXMLLoader.java:1021)
    at javafx.fxml.FXMLLoader$ValueElement.processStartElement(FXMLLoader.java:756)
    at javafx.fxml.FXMLLoader.processStartElement(FXMLLoader.java:2808)
    at javafx.fxml.FXMLLoader.loadImpl(FXMLLoader.java:2634)
    at javafx.fxml.FXMLLoader.loadImpl(FXMLLoader.java:2548)
    at javafx.fxml.FXMLLoader.loadImpl(FXMLLoader.java:3323)
    at javafx.fxml.FXMLLoader.loadImpl(FXMLLoader.java:3280)
    at javafx.fxml.FXMLLoader.loadImpl(FXMLLoader.java:3249)
    at javafx.fxml.FXMLLoader.loadImpl(FXMLLoader.java:3222)
    at javafx.fxml.FXMLLoader.load(FXMLLoader.java:3214)
    at uk.co.cloudswing.openmap.Loader.start(Loader.java:16)
    at com.sun.javafx.application.LauncherImpl.lambda$launchApplication1$9(LauncherImpl.java:846)
    at com.sun.javafx.application.PlatformImpl.lambda$runAndWait$12(PlatformImpl.java:455)
    at com.sun.javafx.application.PlatformImpl.lambda$runLater$10(PlatformImpl.java:428)
    at java.security.AccessController.doPrivileged(AccessController.java:102)
    at com.sun.javafx.application.PlatformImpl.lambda$runLater$11(PlatformImpl.java:427)
    at com.sun.glass.ui.InvokeLaterDispatcher$Future.run(InvokeLaterDispatcher.java:96)
    at com.oracle.svm.jni.JNIJavaCallWrappers.jniInvoke_VA_LIST:Ljava_lang_Runnable_2_0002erun_00028_00029V(JNIJavaCallWrappers.java:0)
    at com.sun.glass.ui.gtk.GtkApplication._runLoop(GtkApplication.java)
    at com.sun.glass.ui.gtk.GtkApplication.lambda$runLoop$11(GtkApplication.java:277)
    ... 3 more
```