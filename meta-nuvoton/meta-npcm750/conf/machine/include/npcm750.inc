#@TYPE: Machine
#@NAME: Nuvoton NPCM750
#@DESCRIPTION: Machine configuration for Nuvoton NPCM750 BMC

require conf/machine/include/tune-nuvoton.inc

PREFERRED_PROVIDER_virtual/kernel ?= "linux-nuvoton"

PREFERRED_VERSION_linux-nuvoton ?= "4.10.15"

PREFERRED_VERSION_u-boot ?= "v2015.10"
PREFERRED_VERSION_u-boot-fw-utils ?= "v2015.10"

KERNEL_IMAGETYPE ?= "uImage"
KERNEL_EXTRA_ARGS ?= "UIMAGE_LOADADDR=0x00008000"

UBOOT_ENTRYPOINT ?= "0x40008000"
UBOOT_LOADADDRESS ?= "0x40008000"
UBOOT_MACHINE ?= "PolegSVB_config"

SERIAL_CONSOLES = "115200;ttyS3"

