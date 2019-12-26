# Copyright (c) Vijai Kumar K <vijaikumar.kanagarajan@gmail.com>, 2019
#
# SPDX-License-Identifier: MIT

inherit dpkg-raw

DESCRIPTION = "This package provides network file for Pine64"

DEBIAN_DEPENDS = "systemd, sed, grep, coreutils, mount, e2fsprogs, util-linux"

SRC_URI = " \
    file://pine64-dhcp"

do_install() {
    install -d -m 755 ${D}/etc/network/interfaces.d/
    install -m 644 ${WORKDIR}/pine64-dhcp ${D}/etc/network/interfaces.d/
}
