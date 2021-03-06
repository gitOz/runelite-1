import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dv")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1592667411
	)
	static int field1364;
	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "[Lls;"
	)
	@Export("mapSceneSprites")
	static IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1209180911
	)
	@Export("id")
	int id;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -2142089503
	)
	@Export("size")
	int size;
	@ObfuscatedName("s")
	@Export("operations")
	int[] operations;
	@ObfuscatedName("t")
	@Export("creationErrors")
	int[] creationErrors;
	@ObfuscatedName("i")
	@Export("fields")
	Field[] fields;
	@ObfuscatedName("o")
	@Export("intReplaceValues")
	int[] intReplaceValues;
	@ObfuscatedName("x")
	@Export("methods")
	Method[] methods;
	@ObfuscatedName("w")
	@Export("arguments")
	byte[][][] arguments;

	ReflectionCheck() {
	} // L: 17

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "947123708"
	)
	static final void method2380() {
		Client.field871 = Client.cycleCntr; // L: 10682
		class8.ClanChat_inClanChat = true; // L: 10683
	} // L: 10684

	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "(Lhq;I)Lhq;",
		garbageValue = "-697509377"
	)
	static Widget method2381(Widget var0) {
		int var2 = WorldMapIcon_0.getWidgetFlags(var0); // L: 10718
		int var1 = var2 >> 17 & 7; // L: 10720
		int var3 = var1; // L: 10722
		if (var1 == 0) { // L: 10723
			return null;
		} else {
			for (int var4 = 0; var4 < var3; ++var4) { // L: 10724
				var0 = TileItem.getWidget(var0.parentId); // L: 10725
				if (var0 == null) { // L: 10726
					return null;
				}
			}

			return var0; // L: 10728
		}
	}
}
