# Showtime-Legacy

Adds blocks from your favorite franchises, FNaF, Showbiz, You name it!

This mod is for Minecraft Java Edition

**Version:** 1.21.1
**Loader:** Fabric
Can be ported to NeoForge with Sinytra Connector

## Contents
- **FNaF 1 Wall** — plain checkerboard wall block
- **FNaF 1 Blue Wall Trim** — wall with blue trim on sides
- **FNaF 1 Wall Trim** — wall with grey trim on sides
- **FNaF 1 Bottom Wall** — lower wall variant
- **Cupcake Prop** — decorative Mr. Cupcake block
- **Showbiz Pizza Trim** — wall trim for Showbiz Pizza Place builds

## Setup Instructions

### 1. Open in an IDE
Open the project folder in VS Code or IntelliJ IDEA.
Run `./gradlew genSources` to generate Minecraft sources.

### 2. Add your textures
Copy your `.png` texture files into: src/main/resources/assets/peetas_custom_fnaf/textures/block/

### 3. Build the mod
```bash
./gradlew build
```
The output `.jar` will be in `build/libs/`.

### 4. Test in-game
Copy the jar to your Fabric mods folder and launch Minecraft 1.21.1.
All blocks appear in the **"Peeta's FNaF"** creative tab.