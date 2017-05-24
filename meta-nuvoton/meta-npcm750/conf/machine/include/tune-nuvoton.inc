DEFAULTTUNE ?= "npcm750"

require conf/machine/include/arm/arch-armv7a.inc

TUNEVALID[npcm750] = "Enable npcm750 specific processor optimizations"
#TUNE_CCARGS .= "${@bb.utils.contains("TUNE_FEATURES", "npcm750", " -mtune=arm7", "", d)}"
#cortexA9
#Need to find out what is the -mtune parameter

AVAILTUNES += "npcm750"
ARMPKGARCH_tune-npcm750 = "armv7a"
TUNE_FEATURES_tune-armv7a = "arm armv7a"
TUNE_FEATURES_tune-npcm750 = "${TUNE_FEATURES_tune-armv7a} npcm750"
PACKAGE_EXTRA_ARCHS_tune-npcm750 = "${PACKAGE_EXTRA_ARCHS_tune-armv7a}"
