<script>
import { RouterLink, RouterView } from 'vue-router'
import StyledRouterLink from './components/StyledRouterLink.vue'

export default {
  components: {
    StyledRouterLink
  }
}
</script>

<template>
  <header>
    <nav>
      <ul>
        <StyledRouterLink path="/hoge" name="hoge"></StyledRouterLink>
        <StyledRouterLink path="/fuga" name="fuga"></StyledRouterLink>
        <StyledRouterLink path="/piyo" name="piyo"></StyledRouterLink>
      </ul>
    </nav>
  </header>
  <main>
    <RouterView />
  </main>
</template>
