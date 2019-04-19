/*
 * Copyright (c) 2018, John James Hamilton <https://github.com/johnhamilto>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.worldmap;

import lombok.Getter;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.Quest;

enum QuestStartLocation
{
	//Free Quests
	COOKS_ASSISTANT_RFD(Quest.COOKS_ASSISTANT, new WorldPoint(3211, 3216, 0)),
	THE_CORSAIR_CURSE(Quest.THE_CORSAIR_CURSE, new WorldPoint(3029, 3273, 0)),
	DEMON_SLAYER(Quest.DEMON_SLAYER, new WorldPoint(3204, 3424, 0)),
	DORICS_QUEST(Quest.DORICS_QUEST, new WorldPoint(2952, 3450, 0)),
	DRAGON_SLAYER(Quest.DRAGON_SLAYER, new WorldPoint(3190, 3362, 0)),
	ERNEST_THE_CHICKEN(Quest.ERNEST_THE_CHICKEN, new WorldPoint(3109, 3330, 0)),
	GOBLIN_DIPLOMACY(Quest.GOBLIN_DIPLOMACY, new WorldPoint(2957, 3509, 0)),
	IMP_CATCHER(Quest.IMP_CATCHER, new WorldPoint(3108, 3160, 0)),
	THE_KNIGHTS_SWORD(Quest.THE_KNIGHTS_SWORD, new WorldPoint(2976, 3342, 0)),
	MISTHALIN_MYSTERY(Quest.MISTHALIN_MYSTERY, new WorldPoint(3234, 3155, 0)),
	PIRATES_TREASURE(Quest.PIRATES_TREASURE, new WorldPoint(3051, 3252, 0)),
	PRINCE_ALI_RESCUE(Quest.PRINCE_ALI_RESCUE, new WorldPoint(3301, 3163, 0)),
	THE_RESTLESS_GHOST(Quest.THE_RESTLESS_GHOST, new WorldPoint(3240, 3210, 0)),
	RUNE_MYSTERIES(Quest.RUNE_MYSTERIES, new WorldPoint(3210, 3220, 0)),
	SHEEP_SHEARER(Quest.SHEEP_SHEARER, new WorldPoint(3190, 3272, 0)),
	SHIELD_OF_ARRAV(Quest.SHIELD_OF_ARRAV, new WorldPoint(3208, 3495, 0)),
	VAMPIRE_SLAYER(Quest.VAMPIRE_SLAYER, new WorldPoint(3096, 3266, 0)),
	WITCHS_POTION(Quest.WITCHS_POTION, new WorldPoint(2967, 3203, 0)),
	X_MARKS_THE_SPOT("X Marks the Spot", new WorldPoint(3227, 3242, 0)),

	//Members' Quests
	ANIMAL_MAGNETISM(Quest.ANIMAL_MAGNETISM, new WorldPoint(3094, 3360, 0)),
	ANOTHER_SLICE_OF_HAM(Quest.ANOTHER_SLICE_OF_HAM, new WorldPoint(2799, 5428, 0)),
	THE_ASCENT_OF_ARCEUUS(Quest.THE_ASCENT_OF_ARCEUUS, new WorldPoint(1700, 3742, 0)),
	BETWEEN_A_ROCK(Quest.BETWEEN_A_ROCK, new WorldPoint(2823, 10168, 0)),
	BIG_CHOMPY_BIRD_HUNTING(Quest.BIG_CHOMPY_BIRD_HUNTING, new WorldPoint(2629, 2981, 0)),
	BIOHAZARD(Quest.BIOHAZARD, new WorldPoint(2591, 3335, 0)),
	BONE_VOYAGE(Quest.BONE_VOYAGE, new WorldPoint(3259, 3450, 0)),
	CABIN_FEVER(Quest.CABIN_FEVER, new WorldPoint(3674, 3496, 0)),
	CLIENT_OF_KOUREND(Quest.CLIENT_OF_KOUREND, new WorldPoint(1823, 3690, 0)),
	CLOCK_TOWER(Quest.CLOCK_TOWER, new WorldPoint(2568, 3249, 0)),
	COLD_WAR(Quest.COLD_WAR, new WorldPoint(2593, 3265, 0)),
	CONTACT(Quest.CONTACT, new WorldPoint(3280, 2770, 0)),
	CREATURE_OF_FENKENSTRAIN(Quest.CREATURE_OF_FENKENSTRAIN, new WorldPoint(3487, 3485, 0)),
	DARKNESS_OF_HALLOWVALE(Quest.DARKNESS_OF_HALLOWVALE, new WorldPoint(3494, 9628, 0)),
	DEATH_PLATEAU_TROLL_STRONGHOLD("Death plateau & Troll stronghold", new WorldPoint(2895, 3528, 0)),
	DEATH_TO_THE_DORGESHUUN(Quest.DEATH_TO_THE_DORGESHUUN, new WorldPoint(3316, 9613, 0)),
	THE_DEPTHS_OF_DESPAIR(Quest.THE_DEPTHS_OF_DESPAIR, new WorldPoint(1846, 3556, 0)),
	DESERT_TREASURE(Quest.DESERT_TREASURE, new WorldPoint(3177, 3043, 0)),
	DEVIOUS_MINDS(Quest.DEVIOUS_MINDS, new WorldPoint(3405, 3492, 0)),
	THE_DIG_SITE(Quest.THE_DIG_SITE, new WorldPoint(3363, 3337, 0)),
	DRAGON_SLAYER_II(Quest.DRAGON_SLAYER_II, new WorldPoint(2456, 2868, 0)),
	DREAM_MENTOR(Quest.DREAM_MENTOR, new WorldPoint(2144, 10346, 0)),
	DRUIDIC_RITUAL(Quest.DRUIDIC_RITUAL, new WorldPoint(2916, 3484, 0)),
	DWARF_CANNON(Quest.DWARF_CANNON, new WorldPoint(2566, 3461, 0)),
	EADGARS_RUSE(Quest.EADGARS_RUSE, new WorldPoint(2896, 3426, 0)),
	EAGLES_PEAK(Quest.EAGLES_PEAK, new WorldPoint(2605, 3264, 0)),
	ELEMENTAL_WORKSHOP("Elemental I & II", new WorldPoint(2714, 3482, 0)),
	ENAKHRAS_LAMENT(Quest.ENAKHRAS_LAMENT, new WorldPoint(3190, 2926, 0)),
	ENLIGHTENED_JOURNEY(Quest.ENLIGHTENED_JOURNEY, new WorldPoint(2809, 3356, 0)),
	THE_EYES_OF_GLOUPHRIE(Quest.THE_EYES_OF_GLOUPHRIE, new WorldPoint(2400, 3419, 0)),
	FAIRYTALE("Fairytale I & II", new WorldPoint(3077, 3258, 0)),
	FAMILY_CREST(Quest.FAMILY_CREST, new WorldPoint(3278, 3404, 0)),
	THE_FEUD(Quest.THE_FEUD, new WorldPoint(3301, 3211, 0)),
	FIGHT_ARENA(Quest.FIGHT_ARENA, new WorldPoint(2565, 3199, 0)),
	FISHING_CONTEST_1(Quest.FISHING_CONTEST, new WorldPoint(2875, 3483, 0)),
	FISHING_CONTEST_2(Quest.FISHING_CONTEST, new WorldPoint(2820, 3487, 0)),
	FORGETTABLE_TALE(Quest.FORGETTABLE_TALE, new WorldPoint(2826, 10215, 0)),
	THE_FORSAKEN_TOWER(Quest.THE_FORSAKEN_TOWER, new WorldPoint(1484, 3747, 0)),
	THE_FREMENNIK_ISLES(Quest.THE_FREMENNIK_ISLES, new WorldPoint(2645, 3711, 0)),
	THE_FREMENNIK_TRIALS(Quest.THE_FREMENNIK_TRIALS, new WorldPoint(2657, 3669, 0)),
	GARDEN_OF_TRANQUILLITY(Quest.GARDEN_OF_TRANQUILLITY, new WorldPoint(3227, 3477, 0)),
	GERTRUDES_CAT_RATCATCHERS(Quest.GERTRUDES_CAT, new WorldPoint(3150, 3411, 0)),
	GHOSTS_AHOY(Quest.GHOSTS_AHOY, new WorldPoint(3677, 3510, 0)),
	THE_GIANT_DWARF(Quest.THE_GIANT_DWARF, new WorldPoint(2841, 10129, 0)),
	THE_GOLEM(Quest.THE_GOLEM, new WorldPoint(3487, 3089, 0)),
	THE_GRAND_TREE_MONKEY_MADNESS("The Grand Tree & Monkey Madness I & II", new WorldPoint(2466, 3497, 0)),
	THE_GREAT_BRAIN_ROBBERY(Quest.THE_GREAT_BRAIN_ROBBERY, new WorldPoint(3681, 2963, 0)),
	GRIM_TALES(Quest.GRIM_TALES, new WorldPoint(2890, 3454, 0)),
	THE_HAND_IN_THE_SAND(Quest.THE_HAND_IN_THE_SAND, new WorldPoint(2552, 3101, 0)),
	HAUNTED_MINE(Quest.HAUNTED_MINE, new WorldPoint(3443, 3258, 0)),
	HAZEEL_CULT(Quest.HAZEEL_CULT, new WorldPoint(2565, 3271, 0)),
	HEROES_QUEST(Quest.HEROES_QUEST, new WorldPoint(2903, 3511, 0)),
	HOLY_GRAIL("Holy Grail & Merlin's Crystal", new WorldPoint(2763, 3515, 0)),
	HORROR_FROM_THE_DEEP(Quest.HORROR_FROM_THE_DEEP, new WorldPoint(2507, 3635, 0)),
	ICTHLARINS_LITTLE_HELPER(Quest.ICTHLARINS_LITTLE_HELPER, new WorldPoint(3314, 2849, 0)),
	IN_SEARCH_OF_THE_MYREQUE(Quest.IN_SEARCH_OF_THE_MYREQUE, new WorldPoint(3502, 3477, 0)),
	JUNGLE_POTION(Quest.JUNGLE_POTION, new WorldPoint(2809, 3086, 0)),
	KINGS_RANSOM(Quest.KINGS_RANSOM, new WorldPoint(2741, 3554, 0)),
	LEGENDS_QUEST(Quest.LEGENDS_QUEST, new WorldPoint(2725, 3367, 0)),
	LOST_CITY(Quest.LOST_CITY, new WorldPoint(3149, 3205, 0)),
	THE_LOST_TRIBE(Quest.THE_LOST_TRIBE, new WorldPoint(3211, 3224, 0)),
	LUNAR_DIPLOMACY(Quest.LUNAR_DIPLOMACY, new WorldPoint(2619, 3689, 0)),
	MAKING_FRIENDS_WITH_MY_ARM(Quest.MAKING_FRIENDS_WITH_MY_ARM, new WorldPoint(2904, 10092, 0)),
	MAKING_HISTORY(Quest.MAKING_HISTORY, new WorldPoint(2435, 3346, 0)),
	MONKS_FRIEND(Quest.MONKS_FRIEND, new WorldPoint(2605, 3209, 0)),
	MOUNTAIN_DAUGHTER(Quest.MOUNTAIN_DAUGHTER, new WorldPoint(2810, 3672, 0)),
	MOURNINGS_ENDS_PART_I(Quest.MOURNINGS_ENDS_PART_I, new WorldPoint(2289, 3149, 0)),
	MOURNINGS_ENDS_PART_II(Quest.MONKEY_MADNESS_II, new WorldPoint(2352, 3172, 0)),
	MURDER_MYSTERY(Quest.MURDER_MYSTERY, new WorldPoint(2740, 3562, 0)),
	MY_ARMS_BIG_ADVENTURE(Quest.MY_ARMS_BIG_ADVENTURE, new WorldPoint(2908, 10088, 0)),
	NATURE_SPIRIT(Quest.NATURE_SPIRIT, new WorldPoint(3440, 9894, 0)),
	OBSERVATORY_QUEST(Quest.OBSERVATORY_QUEST, new WorldPoint(2438, 3185, 0)),
	OLAFS_QUEST(Quest.OLAFS_QUEST, new WorldPoint(2723, 3729, 0)),
	ONE_SMALL_FAVOUR(Quest.ONE_SMALL_FAVOUR, new WorldPoint(2834, 2985, 0)),
	PLAGUE_CITY(Quest.PLAGUE_CITY, new WorldPoint(2567, 3334, 0)),
	PRIEST_IN_PERIL(Quest.PRIEST_IN_PERIL, new WorldPoint(3219, 3473, 0)),
	THE_QUEEN_OF_THIEVES(Quest.THE_QUEEN_OF_THIEVES, new WorldPoint(1795, 3782, 0)),
	RAG_AND_BONE_MAN("Rag and Bone Man I & II", new WorldPoint(3359, 3504, 0)),
	RECRUITMENT_DRIVE_BLACK_KNIGHTS_FORTRESS("Recruitment Drive & Black Knights' Fortress", new WorldPoint(2959, 3336, 0)),
	ROVING_ELVES(Quest.ROVING_ELVES, new WorldPoint(2289, 3146, 0)),
	RUM_DEAL(Quest.RUM_DEAL, new WorldPoint(3679, 3535, 0)),
	SCORPION_CATCHER(Quest.SCORPION_CATCHER, new WorldPoint(2701, 3399, 0)),
	SEA_SLUG(Quest.SEA_SLUG, new WorldPoint(2715, 3302, 0)),
	SHADES_OF_MORTTON(Quest.SHADES_OF_MORTTON, new WorldPoint(3463, 3308, 0)),
	SHADOW_OF_THE_STORM(Quest.SHADES_OF_MORTTON, new WorldPoint(3270, 3159, 0)),
	SHEEP_HERDER(Quest.SHEEP_HERDER, new WorldPoint(2616, 3299, 0)),
	SHILO_VILLAGE(Quest.SHILO_VILLAGE, new WorldPoint(2882, 2951, 0)),
	A_SOULS_BANE(Quest.A_SOULS_BANE, new WorldPoint(3307, 3454, 0)),
	SPIRITS_OF_THE_ELID(Quest.SPIRITS_OF_THE_ELID, new WorldPoint(3441, 2911, 0)),
	SWAN_SONG(Quest.SWAN_SONG, new WorldPoint(2345, 3652, 0)),
	TAI_BWO_WANNAI_TRIO(Quest.TAI_BWO_WANNAI_TRIO, new WorldPoint(2779, 3087, 0)),
	A_TAIL_OF_TWO_CATS(Quest.A_TAIL_OF_TWO_CATS, new WorldPoint(2917, 3557, 0)),
	TALE_OF_THE_RIGHTEOUS(Quest.TALE_OF_THE_RIGHTEOUS, new WorldPoint(1511, 3631, 0)),
	A_TASTE_OF_HOPE(Quest.A_TASTE_OF_HOPE, new WorldPoint(3668, 3216, 0)),
	TEARS_OF_GUTHIX(Quest.TEARS_OF_GUTHIX, new WorldPoint(3251, 9517, 0)),
	TEMPLE_OF_IKOV(Quest.TEMPLE_OF_IKOV, new WorldPoint(2574, 3320, 0)),
	THRONE_OF_MISCELLANIA_ROYAL_TROUBLE("Throne of Miscellania & Royal Trouble", new WorldPoint(2497, 3859, 0)),
	THE_TOURIST_TRAP(Quest.THE_TOURIST_TRAP, new WorldPoint(3302, 3113, 0)),
	TOWER_OF_LIFE(Quest.TOWER_OF_LIFE, new WorldPoint(2640, 3218, 0)),
	TREE_GNOME_VILLAGE(Quest.TREE_GNOME_VILLAGE, new WorldPoint(2541, 3169, 0)),
	TRIBAL_TOTEM(Quest.TRIBAL_TOTEM, new WorldPoint(2790, 3182, 0)),
	TROLL_ROMANCE(Quest.TROLL_ROMANCE, new WorldPoint(2890, 10097, 0)),
	UNDERGROUND_PASS_REGICIDE("Underground Pass & Regicide", new WorldPoint(2575, 3293, 0)),
	WANTED_SLUG_MENACE("Wanted! & The Slug Menace", new WorldPoint(2996, 3373, 0)),
	WATCHTOWER(Quest.WATCHTOWER, new WorldPoint(2545, 3112, 0)),
	WATERFALL_QUEST(Quest.WATERFALL_QUEST, new WorldPoint(2521, 3498, 0)),
	WHAT_LIES_BELOW(Quest.WHAT_LIES_BELOW, new WorldPoint(3265, 3333, 0)),
	WITCHS_HOUSE(Quest.WITCHS_HOUSE, new WorldPoint(2927, 3456, 0)),
	ZOGRE_FLESH_EATERS(Quest.ZOGRE_FLESH_EATERS, new WorldPoint(2442, 3051, 0));

	@Getter
	private final String tooltip;

	@Getter
	private final WorldPoint location;

	@Getter
	private final Quest quest;

	QuestStartLocation(String description, WorldPoint location)
	{
		this.tooltip = description;
		this.location = location;
		this.quest = null;
	}

	QuestStartLocation(Quest quest, WorldPoint location)
	{
		this.tooltip = quest.getName();
		this.location = location;
		this.quest = quest;
	}
}
