#
# Copyright (c) Siemens AG, 2018
# Copyright (c) Vijai Kumar K <vijaikumar.kanagarajan@gmail.com>, 2019
#
# SPDX-License-Identifier: MIT

require recipes-bsp/u-boot/u-boot-custom.inc

BUILD_DEPENDS_append_pine64-plus = " ,arm-trusted-firmware, python, python-dev, swig"

SRC_URI += " \
    ftp://ftp.denx.de/pub/u-boot/u-boot-${PV}.tar.bz2 \
    "
SRC_URI[sha256sum] = "8d6d6070739522dd236cba7055b8736bfe92b4fac0ea18ad809829ca79667014"

# Just for testing purposes, distro package would be recent enough
U_BOOT_TOOLS_PACKAGE = "1"

dpkg_runbuild_prepend_pine64-plus() {
	export BL31="/usr/lib/arm-trusted-firmware/sun50i_a64/bl31.bin"
}

