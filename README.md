# OpenCATe
Will try to develop an online CAT tool
Version 1.0-build_5 - 12/09/2020

# Functionalities:
1. Two language glossary.
2. Glossary prints if entry or expression matches with input string in source language.
3. Creates, writes and reads .txt files.
4. For now, glossary input must be manually introduced.
5. Source file reading enabled!
6. Auto save enabled. For each segment inputted, the target file is saved with target text.
7. Translation memory now prints previously translated segments if there is >70% match in source segments.

# Expressions vs. Glossaries
1. Glossaries are your regular two-way entry dictionary, which should be destined for storing 
2. Expressions are a subtype of glossary, consisting of three elements: the source entry, the target entry and the source keyword. These are returned only if the source keyword is found on the source text. The idea is to store in here all phrases or word patterns you would not normally store in a glossary as it would not pop up in searches.

# Warning!
1. Source file must be created before starting the program to avoid crashes.
2. Max text length set to 800 below (2^31-1)/2 characters, including new lines. This limit is preset for your Translation Memory, but not for your source text reading and the glossary setup, which may hinder target text writing. 
3. Hot keys like "Ctrl+Z" and arrow keys are not enabled.
4. Program works in UTF-8, so some characters may not be read or written. 

# Still not in effect!
I have set an enumeration for setting languages, and the corresponding language class, but I have not enabled them, as I need to get, first, an all-languages list, and second, implement databases to store memory translations and expressions.

# Instructions:
1. Create a file "source.txt" for source text input. If in replit, do it in the same folder as main. If executing .jar file, do it from the same folder than .jar file.
2. Source file reading automatically divides segments for each next line. So, remember to format "source.txt" properly!
3. Set up target file.
4. Introduce glossary entries.
5. Introduce source and target languages (one target max).
6. TMs are multidimensional arrays with n paragraphs and rows and two columns (target and source).
7. For each segment, the program will search for glossary entries you've set up and previous translations you've made of similar paragraphs.
8. Write target paragraph. Input is stored and written into file after translating.
9. Read the .txt with the target text.

# How to run
1. Via Repl.it, click on the icon and test online.
[![Run on Repl.it](https://repl.it/badge/github/emiestevarena/OpenCATe)](https://repl.it/github/emiestevarena/OpenCATe)
2. Via releases. Install OpenJDK14 and download binaries tagged as prerelease. Extract and run via "java -jar filename.jar" on terminal.
