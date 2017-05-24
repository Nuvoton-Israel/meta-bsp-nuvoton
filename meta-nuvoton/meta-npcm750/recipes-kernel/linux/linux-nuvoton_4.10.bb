#require linux-nuvoton.inc

KBRANCH = "Poleg-4.10.15"
SRCREV = "83a6c8fc9d7c6e31bae64d195860beac245741d0"

SRC_URI = "git://github.com/Nuvoton-Israel/linux;protocol=git;branch=${KBRANCH};protocol=https \
		   file://phosphor-gpio-keys.scc \
		   file://phosphor-gpio-keys.cfg \
          "

LINUX_VERSION ?= "4.10.15"
LINUX_VERSION_EXTENSION ?= "-nuvoton"

PR = "r1"
PV = "${LINUX_VERSION}"

S = "${WORKDIR}/git"
#KERNEL_DEVICETREE = "npcm750.dtb"

include linux-nuvoton.inc

#KERNEL_CC += " --sysroot=${PKG_CONFIG_SYSROOT_DIR}"
