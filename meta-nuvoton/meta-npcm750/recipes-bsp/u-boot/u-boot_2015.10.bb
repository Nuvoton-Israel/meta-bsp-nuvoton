require u-boot.inc

LICENSE = "GPLv2+"
#LIC_FILES_CHKSUM = "file://COPYING;md5=1707d6db1d42237583f50183a5651ecb \
#                    file://README;beginline=1;endline=22;md5=78b195c11cb6ef63e6985140db7d7bab"
					
LIC_FILES_CHKSUM = "file://Licenses/README;md5=0507cd7da8e7ad6d6701926ec9b84c95"
# This revision corresponds to the tag "openbmc/fido/v2013.07"
# We use the revision in order to avoid having to fetch it from the repo during parse
SRCREV = "5ec0003b19cbdf06ccd6941237cbc0d1c3468e2d"

PV = "v2015.10"

SRC_URI = "git://git.denx.de/u-boot.git;branch=master;protocol=git \
           file://0001-PolegSVB-Uboot-2015.10-Rev-1.00-03.04.2017.patch \
           file://0001-u-boot_2015-10-add-compiler-gcc6.patch \
		   file://0001-u-boot_2015-10-modify-env-fw.patch \
          "

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"
EXTRA_OEMAKE += "BOARD_NAME=PolegSVB"

