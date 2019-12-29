#
# Copyright (c) Siemens AG, 2018
# Copyright (c) Vijai Kumar K <vijaikumar.kanagarajan@gmail.com>, 2019
#
# SPDX-License-Identifier: MIT

require recipes-kernel/linux/linux-custom.inc

ARCHIVE_VERSION = "${@d.getVar('PV')}"

KBUILD_DEPENDS += "rsync"

SRC_URI += " \
    https://cdn.kernel.org/pub/linux/kernel/v5.x/linux-${ARCHIVE_VERSION}.tar.xz"
SRC_URI[sha256sum] = "d72579aa732edd0e25779adfc43e68a53f77e80020c4aab5db2f5b28c247e98a"

S = "${WORKDIR}/linux-${ARCHIVE_VERSION}"
