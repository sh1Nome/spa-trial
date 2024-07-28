<script setup>
import { RouterLink, RouterView } from 'vue-router'
</script>

<template>
  <header>

    <div class="wrapper">

      <nav>
        <RouterLink to="/hoge">hoge画面</RouterLink>
        <RouterLink to="/fuga">fuga画面</RouterLink>
        <RouterLink to="/piyo">piyo画面</RouterLink>
      </nav>
    </div>
  </header>

  <RouterView />
</template>
