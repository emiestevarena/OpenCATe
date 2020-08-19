# OpenCATe
Will try to develop an online CAT tool
Version 1.0-build_2 - 19/08/2020
# Functionalities:
1. Two language glossary: max length 100 entries.
2. Glossary prints if word matches with input string in source language.
3. Creates and writes .txt files.
4. For now, glossary and source text input must be manually introduced.
5. Auto save enabled. For each segment inputted, the target file is saved with target text.

# Warning!
No error handling is in effect. If you input String where numbers are required, the program will crash.
Max text length set to 800 below (2^31-1)/2. If you operate with or below 32-bits consider writing no more than half of that number. 

# Instructions:
1. Set up target file
2. Introduce glossary entries
3. Set up text length in paragraphs. TMs are multidimensional arrays with n paragraphs and rows and two columns (target and source).
4. Introduce source and target languages (one target max).
5. Introduce first source text paragraph. Program will search for glossary entries you've set up.
6. Write target paragraph. Input is stored and written into file after translating.
7. Read the .txt with the target text.

# How to run
1. Via Repl.it, click on the icon and test online.
[![Run on Repl.it](https://repl.it/badge/github/emiestevarena/OpenCATe)](https://repl.it/github/emiestevarena/OpenCATe)
2. Via releases. Install OpenJDK14 and download binaries tagged as prerelease. Extract and run via java -jar "filename".
