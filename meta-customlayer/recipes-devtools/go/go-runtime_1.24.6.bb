# This defines the required include files from your custom layer.
require go-runtime.inc

# This sets the target version for the build.
GO_PV = "1.24"
PV = "${GO_PV}.6"

# This points to the official Go source tarball.
SRC_URI = "https://golang.org/dl/go${PV}.src.tar.gz"

# This is the SHA256 checksum for go1.24.6.src.tar.gz.
SRC_URI[sha256sum] = "e1cb5582aab588668bc04c07de18688070f6b8c9b2aaf361f821e19bd47cfdbd"

# This sets the bootstrap version.
GO_BOOTSTRAP_URI = "https://golang.org/dl/go1.21.12.src.tar.gz"
GO_BOOTSTRAP_URI[sha256sum] = "30e68af27bc1f1df231e3ab74f3d17d3b8d52a089c79bcaab573b4f1b807ed4f"
