# Showtime-Legacy

> ⚠️ **Note:** Showtime-Legacy is in active development, expect new blocks and changes with each update!

A fan-made Minecraft mod adding decorative blocks from your favorite franchises — FNaF, Showbiz Pizza Place, and more — so you can build authentic pizzeria-style worlds.

This mod pairs great with [Showbiz](https://github.com/FlooferLand/showbiz) for building full Rock-afire style dining rooms!

Not affiliated with or endorsed by Scott Cawthon, Aaron Fechter, Rock-afire Explosion, or Creative Engineering. This is purely a fan project.

## Building

1. Download this project
   - Click the green `< > Code` button and download the ZIP, or clone it with [git](https://git-scm.com/):  git clone https://github.com/PeetaPTGG/Showtime-Legacy
2. Open the project folder in [VS Code](https://code.visualstudio.com/) or IntelliJ IDEA
3. Run `./gradlew genSources` to decompile Minecraft's source (only needed once)
4. Add your `.png` texture files into `src/main/resources/assets/peetas_custom_fnaf/textures/block/`
5. Build the mod: ./gradlew build
6. Grab the output `.jar` from `build/libs/` (the one *without* `-sources` in the name)

Copy that jar into your Fabric 1.21.1 mods folder and launch the game. All blocks appear under the **"Peeta's FNaF"** creative tab.

## Contents

- **FNaF 1 Wall** — plain checkerboard wall block
- **FNaF 1 Blue Wall Trim** — wall with blue trim on sides
- **FNaF 1 Wall Trim** — wall with grey trim on sides
- **FNaF 1 Bottom Wall** — lower wall variant
- **Cupcake Prop** — decorative Mr. Cupcake block
- **Showbiz Pizza Trim** — wall trim for Showbiz Pizza Place builds

## Contributing

This is an open-source project — feel free to open an issue if you find a bug or have a suggestion!