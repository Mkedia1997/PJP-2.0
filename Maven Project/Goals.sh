#!/bin/bash
echo "Enter a plugin to list its goals : "
read plugin
echo "The goals within the plug-in  =>  $plugin are : "
mvn $plugin:help 