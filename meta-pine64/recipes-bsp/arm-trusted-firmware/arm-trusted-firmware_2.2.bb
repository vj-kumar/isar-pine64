#
# Copyright (c) Siemens AG, 2018
# Copyright (c) Vijai Kumar K <vijaikumar.kanagarajan@gmail.com>, 2019
#
# SPDX-License-Identifier: MIT

DESCRIPTION ?= "Arm trusted firmware binaries TF-A"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

inherit dpkg

ARCHIVE_VERSION = "${@d.getVar('PV')}"

PROVIDES += "${PN}-${MACHINE}"

ATF_PLATFORM ?= "sun50i_a64"
ATF_TARGET ?= "bl31"

SRC_URI="https://github.com/ARM-software/arm-trusted-firmware/archive/v${ARCHIVE_VERSION}.tar.gz;name=atf \
	file://debian"
SRC_URI[atf.sha256sum]="07e3c058ae2d95c7d516a46fc93565b797e912c3271ddbf29df523b1ab1ee911"

TEMPLATE_FILES = "debian/control.tmpl"
TEMPLATE_VARS += "MACHINE"

dpkg_runbuild_prepend() {
    export ATF_PLATFORM="${ATF_PLATFORM}"
    export ATF_TARGET="${ATF_TARGET}"
}
