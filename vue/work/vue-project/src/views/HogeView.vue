<script>
import axios from 'axios';
import { mapWritableState } from 'pinia';
import { useStore } from '../stores/store';
export default {
    data() {
        return {
            record: {
                name: ''
            }
        }
    },
    computed: {
        ...mapWritableState(useStore, ['greeting'])
    },
    mounted() {
        axios.get('http://localhost:8080/demo/api/hoge').then(response => this.record = response.data);
    }
}
</script>
<template>
    <div>{{ record.name }}</div>
    <div>{{ greeting }}</div>
</template>
