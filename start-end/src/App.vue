<template>
  <div id="app">
    <TopBanner></TopBanner>
    <login></login>
    <router-view></router-view>
  </div>
</template>

<script>
import TopBanner from './components/TopBanner.vue';
import login from './components/login.vue';
export default {
  name: 'App',
  components: {
    TopBanner,    
    login
  }
}
</script> 

<style>

</style>

