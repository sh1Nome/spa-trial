#!/bin/sh
docker run --rm -v ./work:/local swaggerapi/swagger-codegen-cli-v3 generate \
    -i /local/swagger.yml \
    -l spring \
    -o /local/out/spring \
    -c /local/config.json
