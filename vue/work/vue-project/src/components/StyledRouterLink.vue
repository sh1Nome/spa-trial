<script>
export default {
    props: {
        path: String,
        name: String
    }
}
</script>
<template>
    <li>
        <RouterLink :to="path">{{ name }}画面</RouterLink>
    </li>
</template>