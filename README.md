# Peeta's Custom FNaF Mod

A Fabric 1.21.1 mod adding FNaF-themed decorative blocks and props.

## Contents
- **FNaF 1 Wall** — plain checkerboard wall block
- **FNaF 1 Blue Wall Trim** — wall with blue trim on sides
- **FNaF 1 Wall Trim** — wall with grey trim on sides
- **FNaF 1 Bottom Wall** — lower wall variant
- **Cupcake Prop** — decorative Mr. Cupcake block

## Setup Instructions

### 1. Open in an IDE
Open the `peetas_custom_fnaf` folder in IntelliJ IDEA (recommended).
Run `./gradlew genSources` to generate Minecraft sources.

### 2. Add your textures
Copy your `.png` texture files into:
```
src/main/resources/assets/peetas_custom_fnaf/textures/block/
```

Required textures:
- `fnaf_1_wall.png`
- `fnaf_1_blue_trim_wall.png`
- `fnaf_1_wall_trim.png`
- `fnaf_1_bottom_wall_2.png`
- `Plate.png`
- `candle.png`
- `Flame.png`
- `pink_part.png`
- `eyes.png`
- `teeth.png`
- `body.png`

### 3. Build the mod
```bash
./gradlew build
```
The output `.jar` will be in `build/libs/`.

### 4. Test in-game
Copy the jar to your Fabric mods folder and launch Minecraft 1.21.1.
All blocks appear in the **"Peeta's FNaF"** creative tab.

## Adding Animatronics Later
When you're ready to add animatronic mobs, you'll need:
- A `GeoEntityRenderer` setup (using Geckolib) or a custom `EntityRenderer`
- Entity registration in a new `ModEntities.java` class
- Entity model JSON exported from Blockbench as a **GeckoLib Animated Model**
