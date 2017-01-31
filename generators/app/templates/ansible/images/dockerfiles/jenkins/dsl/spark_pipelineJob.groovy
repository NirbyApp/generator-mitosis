pipelineJob("spark-pipeline") {
    definition {
        cps {
            sandbox()
            script("""
                node {
                      stage "checkout"

                      stage "test"

                      stage "deploy"
                }                 
            """.stripIndent())
        }
    }
}