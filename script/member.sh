selfpath=$(cd "$(dirname "$0")"; pwd)
proj_dir=$(cd "$(dirname "$selfpath/../..")"; pwd)

gradle -p $proj_dir --parallel --refresh-dependencies cE e
