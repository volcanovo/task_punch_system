<template>
  <div class="banner">
    <h1>HGNU-ACM-TASKDONSYS</h1>
    </div>
</template>

<script>
export default {
  name: "TopBanner",
};
</script>


<style>
.banner {
  width: auto;
  height: 100px;
   background: linear-gradient(to top, #d4ddec00, #6abddca9);
  display: flex;
  align-items: center;
  justify-content: center;
  padding: 20px 720px;
  margin-top: -1.5%;
  margin-left: -1%;
  margin-right: -1%;
}
.banner h1 {
  font-size: 32px; 
  font-weight: bold; 
  white-space: nowrap;
  text-align: center;
  font-family: Arial, sans-serif; 
  color: #181a1ebf;
}
.banner h1:hover {
  /* background-color: #68cfd652; */
  color: #375f62dd;
  cursor: pointer;
}
</style>