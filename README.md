[![Release](https://jitpack.io/v/badoualy/stepper-indicator.svg)](https://jitpack.io/#badoualy/stepper-indicator)

# ![](https://github.com/badoualy/stepper-indicator/blob/master/sample/src/main/res/mipmap-mdpi/ic_launcher.png) Stepper indicator
> ### Designed by the awesome https://dribbble.com/LeslyPyram :)
> #### iOS (swift) version available at https://github.com/chenyun122/StepIndicator

<img src="https://github.com/badoualy/stepper-indicator/blob/master/ART/screen.gif" width="300">

Sample
----------------

You can checkout the [Sample Application](https://play.google.com/store/apps/details?id=com.badoualy.stepperindicator.sample) on the Play Store

Setup
----------------

First, add jitpack in your build.gradle at the end of repositories:
 ```gradle
repositories {
    // ...       
    maven { url "https://jitpack.io" }
}
```

Then, add the library dependency:
```gradle
compile 'com.github.badoualy:stepper-indicator:1.0.7'
```

Now go do some awesome stuff!

Usage
----------------

```xml
<com.badoualy.stepperindicator.yey.StepperIndicator
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    app:stpi_stepCount="5"/>
```

Attributes:

| Name                   | Description                                         | Default value   |
|------------------------|-----------------------------------------------------|-----------------|
| stpi_animDuration      | duration of the line tracing animation              | 250 ms          |
| stpi_stepCount         | number of pages/steps                               |                 |
| stpi_circleColor       | color of the stroke circle                          | #b3bdc2 (grey)  |
| stpi_circleRadius      | radius of the circle                                | 10dp            |
| stpi_circleStrokeWidth | width of circle's radius                            | 4dp             |
| stpi_indicatorColor    | color for the current page indicator                | #00b47c (green) |
| stpi_indicatorRadius   | radius for the circle of the current page indicator | 4dp             |
| stpi_lineColor         | color of the line between indicators                | #b3bdc2 (grey)  |
| stpi_lineDoneColor     | color of a line when step is done                   | #00b47c (green) |
| stpi_lineStrokeWidth   | width of the line stroke                            | 2dp             |
| stpi_lineMargin        | margin at each side of the line                     | 5dp             |
| stpi_showDoneIcon      | show the done check icon or not                     | true            |

```java
indicator.setViewPager(pager);
// or keep last page as "end page"
indicator.setViewPager(pager, pager.getAdapter().getCount() - 1); //
// or manual change
indicator.setStepCount(3);
indicator.setCurrentStep(2);
```
## 支持ViewPager2 
原有的项目只有在`ViewPager`上才能使用, 我项目中用的是`ViewPager2`,所以fork后自己适配了`ViewPager2`,具体使用可以看`Demo`.等有时间了再整理`REDME`.
#### 依赖
```groovy
implementation 'com.yey:stepper_indicator:0.0.3'
```
#### 使用
`StepperIndicator2`支持在`ViewPager2`中使用.
- `XML`
```xml
<com.badoualy.stepperindicator.yey.StepperIndicator2
    android:id="@+id/stepper_indicator"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    app:stpi_stepCount="4" />
```
- 代码
```java
viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
    @Override
    public void onPageSelected(int position) {
        super.onPageSelected(position);
        stepperIndicator2.setCurrentStep(position);
    }
});
```

Licence
----------------
```
The MIT License (MIT)

Copyright (c) 2016 Yannick Badoual

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
