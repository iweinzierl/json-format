===========
json-format
===========

.. image:: https://travis-ci.org/iweinzierl/json-format.svg?branch=master
   :target: https://travis-ci.org/iweinzierl/json-format
   :alt: Build Status

A library to format JSON data. Currently, only HTML is supported in order to pretty print the JSON data.

.. code-block:: java

    JsonElement element = ...
    new HtmlFormatter().format(element);

Installation
============

Maven
-----

The library is deployed on central maven repository:

.. code-block:: xml

    <dependency>
        <groupId>com.github.iweinzierl</groupId>
        <artifactId>jsonformat</artifactId>
        <version>1.0</version>
    </dependency>

Gradle
------

.. code-block:: gradle

    compile 'com.github.iweinzierl:jsonformat:1.0'

Manual Build
------------

.. code-block:: bash

    $ mvn package

The resulting jar file can be integrated in your project. The jar is located here: target/jsonformat-${version}.jar

License
=======

Copyright 2013-2015 Ingo Weinzierl

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
