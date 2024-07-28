<script>
import axios from 'axios';
export default {
    data() {
        return {
            record: {
                name: ''
            }
        }
    },
    mounted() {
        axios.get('http://localhost:8080/demo/api/hoge').then(response => this.record = response.data);
    }
}
</script>
<template>
    <div>{{ record.name }}</div>
</template>