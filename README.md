Java Chinese Calendar
=================================

# Introduction

**Java Chinese Calendar** is a Java library of Chinese (lunar) calendar. It can convert date between Gregorian calendar(also called Western calendar) and Chinese calendar. Also, it can compute the weight of Ba Zi(八字).

# Usage

A large part of the code about **Java Chinese Calendar** is written in Chinese.

## 農曆 Class

**農曆** class is in the *org.magiclen.農曆* package.

### Initialize

You can't create a **農曆** instance by using **new** operator directly. You have to use the **建立** static method provided by **農曆** class to create a **農曆** instance.

You can pass the year, month and the days of the month in Gregorian calendar as parameters to **建立** method.

For example, we want to create a **農曆** object instance with the date 2015-12-16 in Gregorian calendar. The code will be,

    農曆.建立(2015, 12, 12);

For example, we want to create a **農曆** object instance with the date 2015-12-16 in Chinese calendar and we know that date is not in a leap month. The code will be,

    農曆 date = 農曆.建立(2015, 12, false, 12);

### Get the date in Gregorian calendar

Use **取得西曆** method to get the date in Gregorian calendar.

    String gregorianDate = date.取得西曆();

### Get the date in Chinese calendar

Use **取得農曆** method to get the date in Chinese calendar.

    String chineseDate = date.取得農曆();

### Compute the weight of Ba Zi(八字)

Use **計算八字有幾兩重** method to compute the weight of Ba Zi. Because **農曆** object has no hour information, if you want to compute the weight of Ba Zi, you have to provide the hour information in the form of the twelve Earthly Branches.

    float BaZiWeight = date.計算八字有幾兩重(農曆.地支.子);

# Run **Java Chinese Calendar** as a program

You can also use the two commands below to run **Java Chinese Calendar**:

     java -jar JavaChineseCalendar.jar

It will show today's date in Gregorian calendar and Chinese calendar. The result just likes

    西曆：2015-12-16
    農曆：2015(乙未、羊年) 冬月 初六

You can input a date in Gregorian calendar. This program can convert it to the date in Chinese calendar.

     java -jar JavaChineseCalendar.jar YYYY MM DD

# License

    Copyright 2015-2018 magiclen.org

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

# What's More?

Please check out our web page at

https://magiclen.org/java-chinese-calendar/
