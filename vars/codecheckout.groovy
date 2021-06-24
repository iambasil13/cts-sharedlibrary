def call(Map stageParams) {
 
    checkout([
        $class: 'GitSCM',
        branches: [[name:  stageParams.branch ]],
        userRemoteConfigs: [[ url: stageParams.url ],[credentialsId:'9ce7e4ae-f637-48ac-b85c-2afe3b7d8913']]
    ])
  }
