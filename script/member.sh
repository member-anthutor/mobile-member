selfpath=$(cd "$(dirname "$0")"; pwd)
proj_dir=$(cd "$(dirname "$selfpath/../tops-mobile-member/..")"; pwd)

gradle -p $proj_dir --parallel --refresh-dependencies cE e
