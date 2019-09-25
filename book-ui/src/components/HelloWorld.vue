<template>
    <button class=”Search__button” @click="callRestService()">CALL Spring Boot REST backend service</button>
</template>

<script>
  import axios from 'axios'

  export default {
      data () {
          return{
              respons:[],
              errors: [],
              firstname: 'Foo',
              lastname: 'Bar',
              fullname: 'Foo Bar'
          }
      },

      watch: {
          firstname: function (val) {
              this.fullname = val + ' ' + this.lastname
          }

      },


    methods: {
      callRestService(){
        return axios.get(`/book`)
                .then(response =>{
                  // eslint-disable-next-line no-console
                  console.log(response.data)
                })
                .catch(e => {
                  this.errors.push(e)
                })
      }
    },

  }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>
