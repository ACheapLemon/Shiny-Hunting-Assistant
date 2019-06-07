# Shiny Hunting Assistant
A simple program to calculate the chance of encountering a Shiny Pokémon across multiple games.

Can be used to calculate the shiny encounter rate for any of the following:
- Random Encounters/Soft Resets/Breeding (Gen II - VII)
- Shiny Breeding (Gen II)
- Masuda Method (Gen IV - VII)
- Chain Fishing (Gen VI)
- Horde Encounters (Gen VI)
- Friend Safari (XY)
- DexNav (ORAS)
- SOS Chaining (SM/USUM)

Will also calculate the approximate number of encounters until an accumulated 50% or 90% chance of encountering a shiny, and will show your current cumulative % depending on your current chain length of current number of encounters.

## Text Files:
This program can also create live output .txt files for use in OBS/SLOBS/etc upon every recalculation. Text files will only appear if a folder called "text_output" is located in the same directory as the executable .jar file.

**encounters.txt** shows the number of Pokemon encounters/hatches you have so far, or your current chain.
For DexNav, this is your current Search Level. Chain is stored as dexnav_chain.txt.

**cumulative.txt** is the total cumulative chance of encountering a shiny after [x] encounters/search level/chain at [y]% chance.
eg. After 2731 encounters with a 1/1366 chance each, the cumulative % is 86.4665% total chance.

**dexnav_chain.txt** is exclusively used by the DexNav method and shows your current DexNav chain.

**hunt_type.txt** shows the method of Shiny Hunting most recently updated within the program.
- DexNav
- Chain Fishing
- SOS Chaining
- Gen II Breeding
- Random Encounters/Soft Resets/Breeding

**shiny_chance.txt** is your current shiny chance as a fraction.
eg. 1/520, 1/1366, etc.
