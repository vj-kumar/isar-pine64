This setup based on submodules is archived. Please use the alternate method using manifest instead.

https://github.com/vj-kumar/isar-manifests
```
repo init -u https://github.com/vj-kumar/isar-manifests.git -m pine64.xml
repo sync
. ./setup-debian-build meta-pine64 
bitbake multiconfig:pine64-plus-buster:isar-image-base
```
