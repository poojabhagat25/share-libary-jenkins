def call() {
sh 'docker rm -f ${CONTAINER_NAME} || true'
}
