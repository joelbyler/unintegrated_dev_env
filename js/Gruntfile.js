module.exports = function(grunt) {

  grunt.loadNpmTasks('grunt-contrib-watch');
  grunt.loadNpmTasks('grunt-mocha-test');
  grunt.loadNpmTasks('grunt-notify');

  grunt.initConfig({
    mochaTest: {
      test: {
        options: {
          reporter: 'spec'
        },
        src: ['test/*.js']
      }
    },
    watch: {
      scripts: {
        files: ['*.js', 'test/*.js'],
        tasks: ['mochaTest'],
      },
    },
  });

  grunt.registerTask('default', ['mochaTest']);
};