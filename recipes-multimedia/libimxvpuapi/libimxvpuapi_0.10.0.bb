DESCRIPTION = "frontend for the i.MX6 VPU hardware video engine"
HOMEPAGE = "https://github.com/Freescale/libimxvpuapi"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=38fa42a5a6425b26d2919b17b1527324"
SECTION = "multimedia"
DEPENDS = "imx-vpu"

SRCBRANCH ?= "master"
SRCREV = "d44fb50780b9de319315cf2f0423def47b58df78"
SRC_URI = "git://github.com/Freescale/libimxvpuapi.git;branch=${SRCBRANCH}"

S = "${WORKDIR}/git"

inherit waf pkgconfig

COMPATIBLE_MACHINE = "(mx6q|mx6dl)"
