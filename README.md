# OpenCATe
Will try to develop an online CAT tool
Version 1.0-build_4 - 24/08/2020
# Functionalities:
1. Two language glossary: max length 100 entries.
2. Glossary prints if word matches with input string in source language.
3. Creates, writes and reads .txt files.
4. For now, glossary input must be manually introduced.
5. Source file reading enabled!
6. Auto save enabled. For each segment inputted, the target file is saved with target text.
7. Translation memory now prints previously translated segments if there is >70% match in source segments.

# Warning!
No error handling is in effect. If you input String where numbers are required, the program will crash.
Max text length set to 800 below (2^31-1)/2. If you operate with or below 32-bits consider writing no more than half of that number.
Source file must be created before starting the program to avoid crashes.
Hot keys like "Ctrl+Z" are not enabled. 
Maximum amount of segments: 1000.

# Instructions:
1. Create a file "source.txt" for source text input. If in replit, do it in the same folder as main. If executing .jar file, do it from the same folder than .jar file.
2. Set up target file
3. Introduce glossary entries
4. Set up text length in paragraphs. TMs are multidimensional arrays with n paragraphs and rows and two columns (target and source).
5. Introduce source and target languages (one target max).
6. For each segment, the program will search for glossary entries you've set up and previous translations you've made of similar paragraphs.
7. Write target paragraph. Input is stored and written into file after translating.
8. Read the .txt with the target text.

# How to run
1. Via Repl.it, click on the icon and test online.
[![Run on Repl.it](https://repl.it/badge/github/emiestevarena/OpenCATe)](https://repl.it/github/emiestevarena/OpenCATe)
2. Via releases. Install OpenJDK14 and download binaries tagged as prerelease. Extract and run via "java -jar filename.jar" on terminal.
